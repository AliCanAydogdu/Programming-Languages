#import <Foundation/NSObject.h>

@interface Rectangle: NSObject

@property (nonatomic) int width;
@property (nonatomic) int height;

-(Rectangle*) initWithWidth: (int) w height: (int) h;
-(void) setWidth: (int) w height: (int) h;
-(void) print;

@end
