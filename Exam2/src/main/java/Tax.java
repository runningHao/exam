import java.util.Scanner;

/**
 * Created by ZhangHao on 2018/8/4.
 */
public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入工资：");
        int salary = sc.nextInt();
        int isalary = salary-3500;
        if(isalary<0){
            System.out.println("不需要缴纳税费");
        }
        else if (isalary<=1500){
            System.out.println("所需缴纳的税费为:"+isalary*0.03);
        }
        else if (isalary<=4500){
            System.out.println("所需缴纳的税费为:"+isalary*0.1);
        }
        else if( isalary<=9000){
            System.out.println("所需缴纳的税费为:"+isalary*0.2);
        }
        else if (isalary<=35000){
            System.out.println("所需缴纳的税费为:"+isalary*0.25);
        }
        else if(isalary<=55000){
            System.out.println("所需缴纳的税费为:"+isalary*0.3);
        }
        else if(isalary<=80000){
            System.out.println("所需缴纳的税费为:"+isalary*0.35);
        }
        else System.out.println("所需缴纳的税费为:"+isalary*0.45);

    }
}
