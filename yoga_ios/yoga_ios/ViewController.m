//
//  ViewController.m
//  yoga_ios
//
//  Created by saint on 2019/1/30.
//  Copyright © 2019年 yiim. All rights reserved.
//

#import "ViewController.h"
#import "YogaKit/UIView+Yoga.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    UIView * root = self.view;
    root.yoga.isEnabled = YES;
    root.yoga.flexDirection = YGFlexDirectionColumn;
    root.yoga.justifyContent = YGJustifyCenter;
    root.yoga.alignItems = YGAlignCenter;
    
    UILabel * label = [UILabel new];
    [label setText:@"hello"];
    [label setTextColor:[UIColor whiteColor]];
    [label setBackgroundColor:[UIColor blackColor]];
    [label setTextAlignment:NSTextAlignmentCenter];
    
    label.yoga.isEnabled = YES;
    label.yoga.width = YGPointValue(100);
    label.yoga.height = YGValueAuto;
    
    [root addSubview:label];
    [root.yoga applyLayoutPreservingOrigin:NO];
}


@end
