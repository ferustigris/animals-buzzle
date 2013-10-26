Crafty.c('Face', {
    init: function() {
        this.requires("2D");
        this.requires("Canvas");      
        this.requires("SpriteAnimation");
        this.requires("Tween")

        function rnd(max) {
            return Math.floor(Math.random() * 1000 * 1000) % max;
        }
        this.animalType = rnd(Game.sprites.length);
        this.requires(Game.sprites[this.animalType]);

        this.attr({x: 0, y: 0});
        this.animate("walk_left", 0, 0, 3);


        var self = this;

        self.animateTimer = function () {
            setTimeout(function(){
                self.animate("walk_left", 20, 1);
                self.animateTimer();
            }, rnd(15000) + 4000);
        }
        self.animateTimer();

        this.bind("MovedHorizontal", function(e) {
            console.log("MovedHorizontal x=" + e.x + ", y=" + e.y);
            self.shift(e.x, 0)
        });

        this.bind("MovedVertical", function(e) {
            console.log("MovedVertical x=" + e.x + ", y=" + e.y);
            self.shift(0, e.y)
        });

        this.bind("Stopped", function(e) {
            console.log("Stopped x=" + e.x + ", y=" + e.y);
            self.tween({
                x: self.x + e.x, 
                y: self.y + e.y
            }, 20)
            self.bind('TweenEnd', function () {
                Game.touchManager.checkBounds(self);
            })
        });
    },

    clear: function() {
        this.removeComponent('Ground');
        this._visible = false;
        this.destroy();
    }
});