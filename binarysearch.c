#include<stdio.h>
int binarysearch(int arr[],int size,int element){
    int lb,ub,mb;
    lb=0;
    ub=size-1;
    while (lb<ub){
    mb=(lb+ub)/2;
    if(arr[mb]==element){
        return mb;
    }
    else if(arr[mb]<element){
        lb=mb+1;
    }
    else{
        ub=mb-1;
    }
}
return -1;
}
int main(){
int arr[30]={1,2,3,4,5,6,7,8,9};
//int size=sizeof(arr)/sizeof(int);
int size=9;
int element=8;
int searchindex=binarysearch(arr,size,element);
printf("The element is at %d",searchindex);
    return 0;
}