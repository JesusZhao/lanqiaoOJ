//
//  main.c
//  begin-3
//
//  Created by Jesus Zhao on 2017/10/12.
//  Copyright © 2017年 Jesus Zhao. All rights reserved.
//

#include <stdio.h>
#include <math.h>

#define PI atan(1.0)*4

int main(int argc, const char * argv[]) {
    int r;
    scanf("%d", &r);
    printf("%.7f\n", PI*r*r);
    return 0;
}
