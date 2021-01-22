package TestFile;



public class Test {
    /*
       getchar()用法：
       gets（str）后面要接收ch是不需要用空的getchar（）吃回车
       前面有scanf，后面要用ch=getchar()接收字符时，中间要用一个空的getchar（）吃回车
       连续用2个getchar（）接收字符时，之后中间要用一个空的getchar（）吃回车
     */



    public static void main(String[] args)
    {
        int n=3;
        char one='a',two='b',three='c';
        hanoi(n,one,two,three);
    }

    static void hanoi(int n,char one,char two,char three){
        if(n==1){
            move(one,three);
        }else{
            hanoi( n-1, one, three, two);
            move(one,three);
            hanoi( n-1, two, one, three);
        }
    }

    static void  move(char get,char put){
        System.out.println(get+"->"+put);
    }


        /* 输入三个整数x,y,z，请把这三个数由小到大输出。 example: 3 2 1 ->2 3 1 ->1 3 2 ->1 2 3
        #include <stdio.h>
        #include <stdlib.h>
        #include <math.h>
        int main(int argc, char *argv[]) {
            int x,y,z,t;
            printf("请连续输入三个整数：");
            scanf("%d%d%d",&x,&y,&z);
            if(x>y){
                t=x;
                x=y;
                y=t;
            }
            if(x>z){
                t=x;
                x=z;
                z=t;
            }
            if(y>z){
                t=y;
                y=z;
                z=t;
            }
            printf("%d%d%d\n",x,y,z);
            return 0;
         }*/


        /* 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
        #include <stdio.h>
        #include <stdlib.h>
        #include <math.h>
        int main(int argc, char *argv[]) {
            int i,x,y;
            for(i=1;i<1001;i++){
                x=sqrt(i+100);
                y=sqrt(i+268);
                if(x*x==i+100 && y*y==i+268){
                    printf("%d\n",i);
                }
            }
        return 0;
        }
         */


        /*有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
        #include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int count=0,i,j,x;
            for(i=1;i<=4;i++){
                for(j=1;j<=4;j++){
                    for(x=1;x<=4;x++){
                        if(i!=j && i!=x && j!=x){
                            count++;
                            printf("%d%d%d\n",i,j,x);
                        }
                    }
                }
            }
            return 0;
         }
         */



        //给定两个圆的圆心O1(x1,y1),O2（x2,y2）和两圆的半径R1，R2 计算两个圆相交的面积
        /*#include <stdio.h>
        #include <stdlib.h>
        #include <math.h>
        #define PI acos(-1.0)

        double Area(double x1,double y1,double x2,double y2,double r1,double r2);
        int main(int argc, char *argv[]) {
            double x1,y1,x2,y2,r1,r2,area;
            printf("请输入两个圆的圆心坐标，以及半径：");
            scanf("%lf%lf%lf%lf%lf%lf",&x1,&y1,&x2,&y2,&r1,&r2);
            area=Area(x1,y1,x2,y2,r1,r2);
            printf("%.2lf\n",area);
            printf("%.2lf",PI);
            return 0;
        }
        double Area(double x1,double y1,double x2, double y2,double r1, double r2){
            double area=0,ang1,ang2,d;
            d=sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
            if( d>=r1+r2){  //相切和相离情况  面积为0
                return  area;
            }
            if(r1>=d+r2){  //r1 包含与 r2
                area=PI*r2*r2;
                return area;
            }
            if(r2>=d+r1){ //r2 包含与 r1
                area=PI*r1*r1;
                return area;
            }
            ang1=acos((r1*r1-r2*r2+d*d)/(r1*d*2));  //第一个圆心角的一半
            ang2=acos((r2*r2-r1*r1+d*d)/(r2*d*2));  //第二个圆心角的一半
            area=ang1*r1*r1+ang2*r2*r2-r1*d*sin(ang1);  //两个扇形面积之和-两倍的△O1AO2
            return area;
        }*/


        //设计一函数，该函数可以将一个10进制整数转换为16进制字符串。并使用该函数输出0～1024对应的16进制字符串。
        /*void change(int num);
	      int main()
	      {
	         int i;
	         for(i=0;i<=1024;i++){
			    change(i);
	          }
	      }
	      void change(int num){
		      int a[100],i=0,yushu;
		      char hex[16]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		      while(num>0)
		      {
			      yushu=num%16;
			      a[i++]=yushu;
			      num=num/16;
		      }
		      printf("转化为十六进制的数为：0x");
		      for(i=i-1;i>=0;i--)//倒序输出
		      {
			      printf("%c",hex[a[i]]);
		      }
		      printf("\n");
		}*/


        /*   输入n(n<=100)个整数，按照绝对值从大到小排序后输出。题目保证对于每一个测试实例，所有的数的绝对值都不相等。  */
        /*#include <stdio.h>
        #include <stdlib.h>
        #include <math.h>
        int main(int argc, char *argv[]) {
            int number[10],i,j,temp,n;
            printf("请输入n位数字：");
            scanf("%d",&n);
            for(i=0;i<n;i++){
                printf("请输入%d位数字：",i+1);
                scanf("%d",&number[i]);
            }
            for(i=0;i<n-1;i++){
                for(j=0;j<n-1-i;j++){
                    if(fabs(number[j+1])>fabs(number[j])){
                        temp=number[j];
                        number[j]=number[j+1];
                        number[j+1]=temp;
                    }
                }
            }
            for(i=0;i<n;i++){
                printf("%d",number[i]);
                if(i!=n-1){
                    printf(" ");
                }
            }
            return 0;
        }*/


        /*    多项式求和：1 - 1/2 + 1/3 - 1/4 + 1/5 - 1/6 + ...  */
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            double sum=0,m,i,temp=1;
            for(i=1;i<=10;i++){
                m=temp/i;
                sum=sum+m;
                temp=-temp;
            }
            printf("%.2lf",sum);
            return 0;
        }*/



        /* "水仙花数 "是指一个三位数，它的各位数字的立方和等于其本身，比如：153=1^3+5^3+3^3  */
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int m,n,temp,i,number1,number2,number3;
            printf("请输入m到n范围内的数字：");
            scanf("%d%d",&m,&n);
            if(m>n){
                temp=m;
                m=n;
                n=temp;
            }
            for(i=m;i<=n;i++){
                number1=i%10;
                number2=i/10%10;
                number3=i/100;
                if(i==number1*number1*number1+number2*number2*number2+number3*number3*number3){
                    printf("%d\n",i);
                }
            }
            return 0;
        }*/


        /* 给定一段连续的整数，求出他们中所有偶数的平方和以及所有奇数的立方和。  */
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int a,b,temp,i,sum1=0,sum2=0;
            printf("请输入开端和结束数字：");
            scanf("%d%d",&a,&b);
            if(a>b){
                temp=a;
                a=b;
                b=temp;
            }
            for(i=a;i<=b;i++){
                if(i%2==0){
                    sum1=sum1+i*i;
                }else{
                    sum2=sum2+i*i*i;
                }
            }
            printf("偶数平方和:%d,奇数立方和:%d",sum1,sum2);
            return 0;
        }*/


        /* 给你三个点，表示一个三角形的三个顶点，现你的任务是求出该三角形的面积*/
        /*#include <stdio.h>
        #include <stdlib.h>
        #include <math.h>
        int main(int argc, char *argv[]) {
            int x1,y1,x2,y2,x3,y3;
            double s;
            printf("请依次输入三角形三个顶点坐标：");
            scanf("%d%d%d%d%d%d",&x1,&y1,&x2,&y2,&x3,&y3);
            if(x1==0 && y1==0 && x2==0 && y2==0 && x3==0 && y3==0){
                printf("输入信息有误！");
                return 0;
            }
            s= fabs((double)x1*y2-x1*y3+x2*y3-x2*y1+x3*y1-x3*y2)/2;
            printf("三角形面积是：%.1lf",s);
            return 0;
        }*/


        /* 九九乘法表*/
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int i,j;
            for(i=1;i<=9;i++){
                for(j=1;j<=i;j++){
                    printf("%dx%d=%d  ",i,j,i*j);
                }
                printf("\n");
            }
            return 0;
        }*/


        /* 给定一行字符，逆序输出此行（空格.数字不输出） */
        /*#include <stdio.h>
        #include <stdlib.h>
        #include <string.h>
        int main(int argc, char *argv[]) {
            char s[1001];
            int i,length;
            printf("请输入一行字符串：");
            gets(s);
            length=strlen(s);
            for(i=length-1;i>=0;i--){
                if(isalpha(s[i])){
                    printf("%c",s[i]);
                }
            }
            return 0;
        }*/



        /* 编写一个程序实现将字符串中的所有"you"替换成"we" */
        /*#include <stdio.h>
        #include <stdlib.h>
        #include <string.h>
        int main(int argc, char *argv[]) {
            char c,s[1001];
            int i=0,j,n,l;
            while((c=getchar())!='\n'){
                s[i]=c;
                i++;
            }
            s[i]='\0';
            l=strlen(s);
            for(j=0;j<l;j++){
                if(s[j]=='y' && s[j+1]=='o' && s[j+2]=='u' ){
                    s[j]='w';
                    s[j+1]='e';
                    s[j+2]='\0';
                }
            }
            for(j=0;j<l;j++){
                if(s[j]!='\0'){
                    printf("%c",s[j]);
                }
            }
            return 0;
        }*/




        /* 有n盏灯，编号为1~n，第1个所有灯打开，第2个人按下所有编号为2 的倍数的开关（这些灯将被关掉），
        第3 个人按下所有编号为3的倍数的开关（其中关掉的灯将被打开，开着的灯将被关闭），
        依此类推。一共有k个人，问最后有哪些灯开着？输入：n和k，输出开着的灯编号。k≤n≤1000 */
        /*#include <stdio.h>
        #include <stdlib.h>
        #include <string.h>
        int main(int argc, char *argv[]) {
            int flag[1001],i,j,n,k;
            printf("请输入一共有多少盏灯：");
            scanf("%d",&n);
            printf("请输入一共有多少个人：");
            scanf("%d",&k);
            memset(flag,0,sizeof(int)*1001);  //数组初始化值为0
            for(i=2;i<=k;i++){
                for(j=1;j<=n;j++){
                    if(j%i==0){
                        if(flag[j-1]==0){
                            flag[j-1]=1; //关灯
                        }
                    }else{
                        flag[j-1]=0;
                    }
                }
            }
            for(i=0;i<n;i++){
                if(flag[i]==0){
                    printf("%d编号的灯开着呢\n",i+1);
                }
            }
            return 0;
        }*/


        /* 已知鸡和兔的总数量为n,总腿数为m。输入n和m,依次输出鸡和兔的数目，如果无解，则输出“No answer”(不要引号)。 */
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int m,n,i,j,jCount,tCount,flag=0;
            printf("请输入鸡和兔子的总数量：");
            scanf("%d",&n);
            printf("请输入总腿数：");
            scanf("%d",&m);
            jCount=m/2;
            tCount=m/4;
            for(i=1;i<=jCount;i++){
                for(j=1;j<=tCount;j++){
                    if((i+j==n) && (i*2+j*4==m)){
                        flag=1;
                        printf("兔子%d个，小鸡%d个",j,i);
                    }
                }
            }
            if(flag==0){
                printf("No answer");
            }
            return 0;
        }*/




        /* 给你n个整数，请按从大到小的顺序输出其中前m大的数。 */
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int arr[1000],i,j,n,m,t;
            printf("请输入一共多少个整数：");
            scanf("%d",&n);
            printf("请输入输出前多少个整数：");
            scanf("%d",&m);
            if(m>n){
                printf("输入有误，请重新输入！");
                return 0;
            }
            for(i=0;i<n;i++){
                printf("请输入第%d位整数：",i);
                scanf("%d",&arr[i]);
            }
            for(i=0;i<n-1;i++){
                for(j=0;j<n-1-i;j++){
                    if(arr[j]<arr[j+1]){
                        t=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=t;
                    }
                }
            }
            for(i=0;i<m;i++){
                printf("%d ",arr[i]);
            }
            return 0;
        }*/



        /*既是素数又是回文的数,比如说151既是素数又是个回文 */
       /* #include <stdio.h>
        #include <math.h>
        #include <stdlib.h>

        int checkSuShu(int n);
        int checkHuiWen(int n);
        int main(int argc, char *argv[]) {
            int i;
            for(i=10;i<=1000;i++){
                if((checkSuShu(i)==1) && (checkHuiWen(i)==1)){
                    printf("%d ",i);
                }
            }
            return 0;
        }
        int checkSuShu(int n){
            int i,flag=1;
            for(i=2;i<=(int)sqrt(n);i++){
                if(n%i==0){
                    flag=0;
                    break;
                }
            }
            return flag;
        }
        int checkHuiWen(int n){
            int flag=1,number=0,t=n;
            while(n){
                number=number*10+n%10;
                n=n/10;
            }
            if(number!=t){
                flag=0;
            }
            return flag;
        }*/




        /*完数的定义：如果一个大于1的正整数的所有因子之和等于它的本身，则称这个数是完数，比如6，28都是完数：6=1+2+3；28=1+2+4+7+14。 */
         /*#include <stdio.h>
         #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int i,j,sum;
            for(i=2;i<1000;i++){
                printf("\n");
                sum=0;
                for(j=1;j<=i/2;j++){
                    if(i%j==0){
                        sum=sum+j;
                    }
                }
                if(sum==i){
                    printf("%d ",i);
                }
            }
            return 0;
        }*/



        /* 还记得中学时候学过的杨辉三角吗？*/
        /*
        #include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int i,j,n,triangle[31][31];
            printf("请输入杨辉三角形层数：");
            scanf("%d",&n);
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    triangle[i][j]=0;
                }
            }
            triangle[0][0]=1;
            triangle[1][0]=1;
            triangle[1][1]=1;
            for(i=2;i<n;i++){
                triangle[i][0]=1;
                triangle[i][i]=1;
                for(j=1;j<i;j++){
                    triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
                }
            }
            for(i=0;i<n;i++){
                for(j=0;j<=i;j++){
                    if(triangle[i][j]!=0){
                        if(j==0){
                            printf("%d",triangle[i][j]);
                        }else{
                            printf(" %d",triangle[i][j]);
                        }
                    }
                }
                printf("\n");
            }
            printf("\n");
            return 0;
        }*/



        /* 统计给定文本文件中汉字的个数。 */
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int result=0;
            char c;
            printf("请输入一段中文汉字：");
            while((c=getchar())!='\n'){
                if(c<0 || c>127){  //是否是中文判断
                    result++;
                }
            }
            printf("一共有%d个汉字\n",result/2);  //中文占用两个字节
            return 0;
        }*/



        
        /* 假设一堆由1分、2分、5分组成的n个硬币总面值为m分，求一共有多少种可能的组合方式（某种面值的硬币可以数量可以为0）。 */
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int sum=0,count,number,a,b,c,oneCount,twoCount,fiveCount;
            printf("请输入一共有多少个硬币：");
            scanf("%d",&number);
            printf("请输入硬币总面值：");
            scanf("%d",&count);
            oneCount= count/1;
            twoCount=count/2;
            fiveCount=count/5;
            for(a=0;a<=oneCount;a++){
                for(b=0;b<=twoCount;b++){
                    for(c=0;c<=fiveCount;c++){
                        if((a+b+c==number) && (a*1+b*2+c*5==count))	{
                            sum++;
                        }
                    }
                }
            }
            printf("一共有%d种组成方式\n",sum);
            return 0;
        }*/


        /* 有一个整型偶数n(2<= n <=10000),你要做的是：先把1到n中的所有奇数从小到大输出，再把所有的偶数从小到大输出。 */
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            long number;
            int i,n;
            printf("请输入整型偶数：");
            scanf("%ld",&number);
            for(i=1;i<=number;i++){
                if(i%2==1){
                    if(i==1){
                        printf("%d",i);
                    }else{
                        printf(" %d",i);
                    }
                }
            }
            printf("\n");
            for(i=2;i<=number;i++){
                if(i%2==0){
                    if(i==2){
                        printf("%d",i);
                    }else{
                        printf(" %d",i);
                    }
                }
            }
            return 0;
        }*/




        /*求n个整数中倒数第二小的数。每一个整数都独立看成一个数，比如，有三个数分别是1，1，3，那么，第二小的数就是1。 */
       /* #include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int i,min,minFlag,n[5];
            for(i=0;i<5;i++){
                printf("请输入第%d个数字：",i+1);
                scanf("%d",&n[i]);
            }
            for(i=0;i<5;i++){
                if(i==0){
                    min=n[i];
                    minFlag=i;
                    continue;
                }
                if(min>n[i]){
                    min=n[i];
                    minFlag=i;
                }
            }
            for(i=0;i<5;i++){
                if(i!=minFlag){
                    min=n[i];
                    break;
                }
            }
            for(i=0;i<5;i++){
                if(i!=minFlag && n[i]<min){
                    min=n[i];
                }
            }
            printf("第二数小的是：%d\n",min);
            return 0;
        }*/



        /*编写一个C程序，实现两个分数的加减法 */
        /*#include <stdio.h>
        #include <stdlib.h>
        int gcd(int a,int b);
        int main(int argc, char *argv[]) {
            int a,b,c,d,fenmu,fenzi;
            char sign,temp;
            while(scanf("%d/%d%c%d/%d",&a,&b,&sign,&c,&d)!=EOF){
                fenmu=b*d/gcd(b,d);  //最小公倍数
                if(sign=='+'){
                    fenzi=a*fenmu/b+c*fenmu/d;
                }else{
                    fenzi=a*fenmu/b-c*fenmu/d;
                }
                if(fenzi==0){  //分子为0直接输出0
                    printf("0\n");
                    continue;
                }
                if(fenzi<0){  //当为负数时，化为正数，标记负号
                    fenzi=-fenzi;
                    printf("-");
                }
                if(fenzi%fenmu==0){  //如果整除时直接输出商
                    printf("%d\n",fenzi/fenmu);
                }
                else{   //不整除时以分数的形式输出
                    printf("%d/%d\n",fenzi/gcd(fenmu,fenzi),fenmu/gcd(fenmu,fenzi));
                }
            }
        return 0;
        }
        int gcd(int a,int b){
            int temp;
            if(a<b){
                temp=a;
                a=b;
                b=temp;
            }
            while(a%b!=0){
                temp=a%b;
                a=b;
                b=temp;
            }
            return b;
        }*/


        /* 设计一个从5个整数中取最小数和最大数的程序*/
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int i,max,min,number;
            for(i=0;i<5;i++){
                printf("请输入数字：");
                scanf("%d",&number);
                if(i==0){
                    min=number;
                    max=number;
                    continue;
                }
                if(min>number){
                    min=number;
                }
                if(max<number){
                    max=number;
                }
            }
            printf("最大数：%d,最小数：%d",max,min);
            return 0;
        }*/



        /* 最大公约数和最小公倍数 */
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int a,b,A,B,i,t;
            printf("请输入两个需要判别的数字：");
            scanf("%d%d",&a,&b);
            if(a<b){
                t=a;
                a=b;
                b=t;
            }
            A=a;
            B=b;
            while(a%b!=0){
                t=a%b;
                a=b;
                b=t;
            }
            printf("最大公约数是：%d,最小公倍数是：%d",b,A*B/b);
            return 0;
        }*/


        /* 输入三个字符（可以重复）后，按各字符的ASCII码从小到大的顺序输出这三个字符。 */
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            char a,b,c,temp;
            printf("请连续输入三个字符：");
            scanf("%c%c%c",&a,&b,&c);
            if(a>b){
                temp=a;
                a=b;
                b=temp;
            }
            if(a>c){
                temp=a;
                a=c;
                c=temp;
            }
            if(b>c){
                temp=b;
                b=c;
                c=temp;
            }
            printf("%c %c %c\n",a,b,c);
            return 0;
        }*/



        /* 统计给定的n个数中，负数、零和正数的个数。 */
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int n,number,a=0,b=0,c=0,i;
            printf("请输入要判别总数：");
            scanf("%d",&n);
            for(i=0;i<n;i++){
                printf("请输入具体数字：");
                scanf("%d",&number);
                if(number>0){
                    a++;
                }else if(number==0){
                    b++;
                }else{
                    c++;
                 }
             }
        printf("正数：%d,零：%d,负数：%d\n",a,b,c);
        return 0;
       }*/



        /* 烧饼有两面，要做好一个兰州烧饼，要两面都弄热。当然，一次只能弄一个的话，效率就太低了。有这么一个大平底锅，
        一次可以同时放入k个兰州烧饼，一分钟能做好一面。而现在有n个兰州烧饼，至少需要多少分钟才能全部做好呢？
          a , b, ,c d  a=b,a=c,b=c,*/
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(){
            int n,k,total,result;
            printf("请输入一共有多少个饼:");
	        scanf("%d",&n);
	        printf("每锅可以煎几个饼:");
	        scanf("%d",&k);
	        if(k>=1 && n<10000){
		        total=n*2;
                if(total<=k){
                    printf("2\n");
                }
                result=total/k;
                if(total%k!=0){
        	        result++;
		        }
                printf("一共需要%d分钟",result);
	        }else{
		        printf("请输入信息有误！");
	        }
	        return 0;
	    }*/


        //键盘输入两个3行3列的矩阵，输出这两个矩阵的和矩阵。
       /* #include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int a[3][3],b[3][3],c[3][3];
            int i,j;
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    printf("第一个矩阵请输入第%d行第%d列值:",i,j);
                    scanf("%d",&a[i][j]);
                }
           }
           for(i=0;i<3;i++){
               for(j=0;j<3;j++){
                   printf("第二个矩阵请输入第%d行第%d列值:",i,j);
                   scanf("%d",&b[i][j]);
               }
           }
           for(i=0;i<3;i++){
              for(j=0;j<3;j++){
                 c[i][j]=a[i][j]+b[i][j];
               }
            }
           for(i=0;i<3;i++){
              for(j=0;j<3;j++){
                 printf("%d ",c[i][j]);
              }
              if(j==3){
                 printf("\n");
               }
            }
        return 0;
    }*/


        //求a的平方根的迭代公式为x(n+1)=(xn+a/xn)/2 。设计一自定义求平方根函数，并利用此函数输出1到100的平方根。
        /*#include <stdio.h>
        #include <stdlib.h>
        #include <math.h>
        double fun(double a,double x0);
        int main(int argc, char *argv[]) {
            double i;
            for(i=1;i<=100;i++){
                printf("%.1lf的平方根是%.3lf\n",i,fun(i,1.0));
            }
            return 0;
        }
        double fun(double a,double x0){
            double x1,y;
            x1=(x0+a/x0)/2.0;
            if(fabs(x1-x0)>=0.00001){
                y=fun(a,x1);
            }else{
                y=x1;
            }
            return y;
        }*/


        //输入1980年1月1日至2099年12月31日之间的任一年月日，求该日期为该年的第几天。
        /*#include <stdio.h>
        #include <stdlib.h>
        struct Date{
        int year;
        int day;
        int month;
        };
        int check(int year);
        int main(int argc, char *argv[]) {
            struct Date date;
            int days=0,i;
            int m[12]={31,28,31,30,31,30,31,31,30,31,30,31};
            printf("请输入年-月-日格式日期：") ;
            scanf("%d-%d-%d",&date.year,&date.month,&date.day);
            if(date.year<1980 || date.year>2099){
                printf("输入日期有误，请重新输入！") ;
            }else{
                for(i=0;i<date.month-1;i++){
                    days+=m[i];
                }
                if(check(date.year) && date.month>2){
                    days+=1;
                }
            days+=date.day;
            printf("该日期为该年的第%d天",days) ;
            }
        return 0;
     }
      int check(int year){
        if((year%4==0 && year%100!=0) || (year%400==0)){
            return 1;
        }else{
            return 0;
        }
    }*/


        /*首先输入一个点A的平面坐标，再输入一个矩形的左上角和右下角平面坐标，
        判断这个点A在矩形的内部、外部还是边上，输出计算结果。*/
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int a[3][2];
            printf("请输入A点坐标：");
            scanf("%d,%d",&a[0][0],&a[0][1]);
            printf("请输入左上角一点坐标：");
            scanf("%d,%d",&a[1][0],&a[1][1]);
            printf("请输入右下角一点坐标：");
            scanf("%d,%d",&a[2][0],&a[2][1]);
            if((a[0][0]==a[1][0] && a[2][1]<=a[0][1] && a[1][1]>=a[0][1] )  ||
	            ( a[0][1]==a[1][1] && a[0][0]>=a[1][0] && a[0][0]<=a[2][0] ) ||
	            ( a[0][1]==a[2][1]  && a[0][0]<=a[2][0] && a[0][0]>=a[1][0])||
	            ( a[0][0]==a[2][0] && a[0][1]<=a[1][1] && a[0][1]>=a[2][1] )) {
			        printf("A点在边上");
	        }else if(a[1][0]<a[0][0] && a[0][0]<a[2][0] &&  a[2][1]<a[0][1] && a[0][1]<a[1][1] ) {
			     printf("A点在内部");
	        }else  {
			    printf("A点在外部");
	        }
            return 0;
        }*/



        //输入两个点的平面坐标，输出这两个点之间的距离。
      /*
        float x1,x2,y1,y2,sum;
        scanf("%f%f%f%f",&x1,&y1,&x2,&y2);
        if(x1>=0 && x2>=0 && y1>=0 && y2>=0){
            sum=sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        }
        printf("%.2f\n",sum);
        */


      //输入三个整数，输出中间那个不大不小的数。
       /*void main()
        {
      int a,b,c;
        printf("请输入3个整数！\n");
        scanf("%d%d%d",&a,&b,&c); 
         if(a>b){
        if(a<c){
                    printf("%d\n",a);
                  }else{
                   printf("%d\n",c>b?c:b);
                  }           
         }else{
        if(b<c){
                    printf("%d\n",b);
                }else{
                    printf("%d\n",c>a?c:a);   
                }       
         }       
       } 
 */



        //输入一个正整数，把该正整数的每位数字转换汉字输出。例如输入51024，输出五一〇二四。
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            char s[10][10]={"〇","一","二","三","四","五","六","七","八","九"};
            long z;
            int n[10],i,j=0;
            printf("请输入正整数：");
            scanf("%ld",&z);
            while(z!=0){
                n[j]=z%10;
                z=z/10;
                j++;
            }
            for(i=j-1;i>=0;i--){
                printf("%s",s[n[i]]);
            }
            return 0;
        }*/


        //键盘输入一些整数（少于100个），其值在0到4之间（包括0和4），用-1作为输入结束标志，统计每个整数的个数。
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int count[5], n[100],i,z;
            for(i=0;i<=4;i++){
                count[i]=0;
            }
            printf("请输入一些整数（少于100个）：");
            scanf("%d",&z);
            while(z!=-1){
                count[z]++;
                scanf("%d",&z);
            }
            for(i=0;i<=4;i++){
                printf("%d的个数有%d个",i,count[i]);
            }
            return 0;
        }*/



        /*
        输入梯形的上底、下底和高，计算梯形的面积，输出计算结果。
        梯形面积公式为：area=((a+c)*h)/2 ,a为上底，c为下底，h为高度
         */
        /*#include <stdio.h>
        int main()
        {
            float a,c,h,area;
            printf("请你输入梯形的边长a,b和高度h:\n");
            scanf("%f %f %f",&a,&c,&h);
            area=((a+c)*h)/2;
            printf("梯形的面积为:%0.03f\n",area);
            return 0;
        }*/


        //输入一个球的半径，计算这个球的表面积和体积，输出计算结果
        // S=4ΠR^2       V=4/3ΠR^3。

       /* #include <stdio.h>
        #define PI 3.14
        int main()
        {
            double r,v,s;
            scanf("%lf",&r);//输入半径。
            s=4*PI*r*r;
            v=4*PI*r*r*r/3;//计算表面积和4102体积1653
            printf("表面积为%lf, 体积为%lf\n", s,v);//输出结果。
            return 0;
        }*/


       // 输入一个圆的半径，计算这个圆的面积和周长

      /*#include
       #define pi 3.14
        void main()
        {
            double r;
            scanf("%lf",&r);
            printf("周长:%.2lf\n",2*pi*r);
            printf("面积:%.2lf\n",pi*r*r);
        }*/


      /*
         据输入的三角形的三条边判断三角形的类型，并输出它的面积和类型。
         输入一个三角形的三条边长，判断这三条边能否构成直角三角形，输出计算结果
         三角形面积： P=(a+b+c)/2  S=sqrt[p(p-a)(p-b)(p-c)]*/
      /* #include<stdio.h>
       #include<math.h>
        void main()
        {
            float a, b, c;
            float s, area;
            scanf("%f,%f,%f",&a,&b,&c);
            {
                s=(a+b+c)/2;
                area=(float)sqrt(s*(s-a)*(s-b)*(s-c));
                printf("面积是： %f\n",area);
                if(a==b&&a==c)
                    printf("等边三角形\n");
                else if(a==b||a==c||b==c)
                    printf("等腰三角形\n");
                else if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(b*b+c*c==a*a))
                    printf("直角三角形\n");
                else
                    printf("普通三角形");
            }
            else
                printf("不能构成三角形");
        }*/


        //根据公式π/4=1-1/3+1/5-1/7+1/9-1/11+……，计算π的近似值，当最后一项的绝对值小于0.000001为止。
        /*;
       #include<stdio.h>
       #include<math.h>
       int main(){
	        double m = 1,n = 1,pi = 0;
	        while((fabs(n))>0.000001)
	        {
		        pi = pi + n;
		        m = m + 2;
		        i = -i;
		        n = i/m;
	         }
	         pi = pi * 4;
            printf("近似值是："+pi);
        return 0;
      }*/



       //键盘输入20个学生的姓名和总分，按总分从大到小的顺序输出这20个学生的姓名和总分。
      /* #include <stdio.h>
        #include <stdlib.h>
        #include <math.h>
        struct student{
	       char name[5];
	       double score;
        } stu[3];
        int main(int argc, char *argv[]) {
        int i,j;
        struct student s;
        for(i=0;i<3;i++){
    	    printf("请分别输入第%d名学生的姓名以及总分：",i+1);
		    scanf("%s",&stu[i].name);
		    scanf("%lf",&stu[i].score);
	    }
        for(i=0;i<2;i++){
    	    for(j=0;j<3-i-1;j++){
    		    if(stu[j].score<stu[j+1].score){
    			    s=stu[j];
    			    stu[j]=stu[j+1];
    			    stu[j+1]=s;
			    }
		    }
	    }
        for(i=0;i<3;i++){
    	    printf("%s同学的总分是:%lf\n",stu[i].name,stu[i].score);
	    }
	    return 0;
    }*/


        /*一个数只能被1和它本身整除的数叫素数。
        设计一函数可以判断一个数是否是素数，并利用此函数输出2到1000以内的所有素数。*/
       /* #include <stdio.h>
        #include <math.h>
        int check(int n);
        int main(int argc, char *argv[]) {
            int j;
            for(j=2;j<=1000;j++){
                if(check(j)){
                    printf("%d是素数\n",j);
                }
             }
            return 0;
        }
        int check(int n){
            int t,i;
            t=(int)sqrt(n);
            for(i=2;i<=t;i++){
                if(n%i==0){
                    return 0;
                 }
            }
            return 1;
         }*/



     /*
        题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月
　　　  后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总对数为多少？
        月份: 1        2        3            4            5        6        7         8...
        对数: 1        1        2            3            5        8       13         21.
        #include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
	        int i,f1=1,f2=1,sum=0,m;
	        printf("请输入月份：");
	        scanf("%d",&m);
	        if(m==1 || m==2){
		        sum=1;
	        }else{
		        for(i=3;i<=m;i++){
			        sum=f1+f2;
			        f1=f2;
			        f2=sum;
		        }
	        }
	    printf("%d月共有%d对兔子",m,sum);
	    return 0;
        }*/



        //一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在
        //第10次落地时，共经过多少米？第10次反弹多高？
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            double sum=100,m=100;
            int i;
            m=m/2;
            for(i=2;i<=10;i++){
                sum=sum+m*2;
                m=m/2;
            }
            printf("共经过%.2lf米，第10次反弹%.2lf米",sum,m);
            return 0;
        }*/




        /*猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
　　　第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下
　　　的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。*/
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int i,sum=1;
            for(i=9;i>=1;i--){
                sum=(sum+1)*2;
            }
            printf("一共%d只桃子：",sum);
        return 0;
        }*/



       /*两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定
　　　比赛名单。有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出
　　　三队赛手的名单。*/
       /*
       int main(int argc, char *argv[]) {
	   char a,b,c,i,j;
	   for (i='x';i<='z';i++){
	        if(i!='x' && i!='z'){
			    c=i;
		    }
		    if(i!=c && i!='x'){
			    a=i;
		    }
		    if(i!=c && i!=a){
			    b=i;
		    }
	    }
	    printf("a和%c-b和%c-c和%c",a,b,c);
	    return 0;
        }*/


        //将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5
        /*#include <stdio.h>
        #include <stdlib.h>
        int main(int argc, char *argv[]) {
            int n,i;
            printf("请输入所要分解的质因数：");
            scanf("%d",&n);
            printf("%d=",n);
            for(i=2;i<=n;i++){
                while(n%i==0){
                    printf("%d",i);
                    n/=i;
                    if(n!=1){
                        printf("*");
                    }
                }
            }
            return 0;
        }*/


       /* 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时
          共有5个数相加)，几个数相加有键盘控制。(int)pow(10,count-i);
         #include <stdio.h>
         #include <stdlib.h>
        int main(int argc, char *argv[]) {
	    int i,j=0, sum=0,n ,m;
	    printf("请输入求和位数以及所求数字：");
	    scanf("%d%d",&m,&n);
	    for(i=1;i<=m;i++){
		    j=n+j*10;
		    sum=sum+j;
	    }
        printf("%d",sum);
	    return 0;
        }*/



       /* 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
       int main(int argc, char *argv[]) {
	   double sum=0;
	   int i,j=2,x=1;
	        for(i=1;i<=20;i++){
	            sum=sum+j/x;
		        x=j;
		        j=j+i;
	        }
	    printf("%.2lf",sum);
	    return 0;
        }*/



        /*题目：求1+2!+3!+...+20!的和
        int main(int argc, char *argv[]) {
	    int sum=0,i,j=1;
	    for(i=1;i<=20;i++){
		    j=j*i;
		    sum=sum+j;
	     }
	    printf("%d",sum);
	    return 0;
        }*/



        /* 对10个数进行排序（冒泡）
          #include <stdio.h>
          #include <stdlib.h>
          #include <math.h>
          int main(int argc, char *argv[]) {
            int a[5],i,j,t;
            printf("请输入5位有效数字：");
            for(i=0;i<5;i++){
                scanf("%d",&a[i]);
            }
            for(i=0;i<5-1;i++){
                for(j=0;j<5-1-i;j++){
                    if(a[j]>a[j+1]){
                        t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
                }
            }
            for(i=0;i<5;i++){
                printf("%d",a[i]);
            }
            return 0;
        }*/



    }






}
