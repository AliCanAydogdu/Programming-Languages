#import "Rectangle.h"
#import <stdio.h>

@implementation Rectangle

@synthesize width = _width;
@synthesize height = _height;

-(Rectangle*) initWithWidth: (int) w height: (int) h {
    self = [super init];

    if ( self ) {
        [self setWidth: w height: h];
    }

    return self;
}

-(void) setWidth: (int) w height: (int) h {
    self.width = w;
    self.height = h;
}

-(void) print {
    printf( "width = %i, height = %i", self.width, self.height );
}

@end
