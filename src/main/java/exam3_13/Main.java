package exam3_13;

//3.13面试题
/*
* 1.将一个降序排序。并列出正数，负数，零的个数；
* 2.打印99乘法表；
* 3.将AAADCCCB打印成A3DC3B；
* 4.将100元尽可能用完，商品有5元鸡，3元鸡，2元鸡，列出所有的可能；
* 5.用二分法获取一个升序整数数组的某个元素的索引值
* */
public class Main {
    public static void main(String[] args) {
       /* int[] arr={1,-2,3,4,5,6,-7,0,10,9};
        test(arr);
        test2();
        test3("ABBCCEEFFTA");
       test4_1(101,5,3,2);*/
        int[] arr2={1,3,5,7,10,20,39};
        int target=5;
        test5(arr2,target);
    }
    public static void test(int[] arr){
        int count1=0;
        int count2=0;
        int count3=0;
        int example=0;
        //对数组排序
        for(int i=0;i<10;i++){
            for(int j=0;j<10-i-1;j++){
                if(arr[j]>arr[j+1]){
                    example=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=example;
                }
            }
        }
        //计算正负次数
        for(int k=0;k<10;k++){
           if(arr[k]>0){
               count1++;
           }else if(arr[k]<0){
               count2++;
           }else {
               count3++;
           }
        }
       for(int n=0;n<10;n++){
           System.out.print(arr[10-n-1]+" ");
       }
        System.out.println();
        System.out.println("正数个数:"+count1);
        System.out.println("负数个数:"+count2);
        System.out.println("零个数:"+count3);
    }

    public static void test2(){
        for(int i=1;i<10;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }

    public static void test3(String s){
        char[] chars = s.toCharArray();
        int count=1;
        if(chars.length>0){
            System.out.print(chars[0]);
        }
        for(int i=1;i<chars.length;i++){
             if(chars[i]==chars[i-1]){
                 count++;
             }else{
                 if(count==1){
                     System.out.print(chars[i]);
                 }else {
                     System.out.print(count+""+chars[i]);
                     count=1;
                 }
             }
        }
        if(count!=1){
            System.out.print(count);
        }
    }
    //拿着a元，bcd分别为大鸡，中鸡，小鸡的的价格，ijk为购买大鸡，中鸡，小鸡的数量;
    public static void test4(int a,int b,int c,int d){
        int i=0;
        int j=0;
        int k=0;
        int count=1;
        while(i*b<=a){
            while(j*c<=a-i*b){
                k=(a-i*b-j*c)/d;
                System.out.println("方案"+count+":买大鸡"+i+"只，"+"买中鸡"+j+"只，"+"买小鸡"+k+"只。");
                j++;
                count++;
            }
            j= 0;
            i++;
        }
    }
    public static void test4_1(int a,int b,int c,int d){
        int count=1;
        int k=0;
        for(int i=0;b*i<=a;i++){
            for(int j=0;c*j<=a-b*i;j++){
                k=(a-i*b-j*c)/d;
                System.out.println("方案"+count+":买大鸡"+i+"只，"+"买中鸡"+j+"只，"+"买小鸡"+k+"只。");
                count++;
            }
        }
    }
    public static void test5(int[] arr,int target){
        int first=0;
        int last=arr.length-1;
        int middle=0;
        while(first<=last){
            middle=(first+last)/2;
            if(arr[middle]>target){
                last=middle-1;
            }else if(arr[middle]<target){
                first=middle+1;
            }else if(arr[middle]==target){
                System.out.println("目标元素的索引值是:"+middle);
                return;
            }
        }
        System.out.println("数组没有该元素");
    }
}
