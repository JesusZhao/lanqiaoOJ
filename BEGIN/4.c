//
//  main.c
//  begin-4
//
//  Created by Jesus Zhao on 2017/10/12.
//  Copyright © 2017年 Jesus Zhao. All rights reserved.
//

#include <stdio.h>
const int MOD = 10007;

int main(int argc, const char * argv[]) {
    int i=0;
    unsigned long int n, f1=1, f2=1, f3=1;
    scanf("%ld", &n);
    if(n>2){
        for(i=3;i<=n;i++){
            f3=(f1+f2)%MOD;// 不必等到计算出最后的F(n)再求余，可以这样边算边求
            f1=f2;// 因为F(n)只与F(n-1)和F(n-2)有关系，所以只需保存F(n-1)和F(n-2)即可
            f2=f3;// 而不必定义一个大数组保存所有中间结果
        }
    }
    printf("%ld\n", f3);
    return 0;
}
