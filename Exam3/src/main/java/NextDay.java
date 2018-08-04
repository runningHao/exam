import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by ZhangHao on 2018/8/4.
 */
public class NextDay {
    public static void main(String[] args) {
        System.out.print("请输入日期：");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        GregorianCalendar gre = new GregorianCalendar();
        boolean isLeapYear = gre.isLeapYear(year);
        switch(month){
            case 1:if(day<1||day>31){System.out.println("输入的日期不合法");return;}
            else if(day==31){day =0;++month;}
                break;
            case 2:if(isLeapYear){
                if(day<1||day>29){System.out.println("输入的日期不合法");return;}
                else if(day==29){day=0;++month;}
            }
            else{
                if(day<1||day>28){System.out.println("输入的日期不合法");return;}
                else if(day==28){day=0;++month;}
            }
                break;
            case 3:if(day<1||day>31){System.out.println("输入的日期不合法");return;}
            else if(day==31){day =0;++month;}
                break;
            case 4:if(day<1||day>30){System.out.println("输入的日期不合法");return;}
            else if(day==30){day =0;++month;}
                break;
            case 5:if(day<1||day>31){System.out.println("输入的日期不合法");return;}
            else if(day==31){day =0;++month;}
                break;
            case 6:if(day<1||day>30){System.out.println("输入的日期不合法");return;}
            else if(day==30){day =0;++month;}
                break;
            case 7:if(day<1||day>31){System.out.println("输入的日期不合法");return;}
            else if(day==31){day =0;++month;}
                break;
            case 8:if(day<1||day>31){System.out.println("输入的日期不合法");return;}
            else if(day==31){day =0;++month;}
                break;
            case 9:if(day<1||day>30){System.out.println("输入的日期不合法");return;}
            else if(day==30){day =0;++month;}
                break;
            case 10:if(day<1||day>31){System.out.println("输入的日期不合法");return;}
            else if(day==31){day =0;++month;}
                break;
            case 11:if(day<1||day>30){System.out.println("输入的日期不合法");return;}
            else if(day==30){day =0;++month;}
                break;
            case 12:if(day<1||day>31){System.out.println("输入的日期不合法");return;}
            else if(day==31){day =0;++month;}
                break;
            default:System.out.println("您输入的日期不存在");
                return;
        }
        if(month>12){month=1;++year;}
        ++day;
        System.out.println("下一天为："+year+"-"+month+"-"+day);


    }
}
