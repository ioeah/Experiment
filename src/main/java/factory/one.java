package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/15 0:30
 */
public class one {

    public static void main(String[] args) throws IOException {

        fun();
    }

    public static void fun() throws IOException {
        System.out.print("输入符号串:(最后以\";\"结束):");
        //系统输入流变成字符流，字符流放到缓冲区
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //读取一行数据
        String strings = br.readLine();
        //如果没有数据直接结束
        if (strings.length() == 0 || strings == null) {
            System.out.println("error!");
            return;
        } else {
            int w = 0; // 尾数累加器
            int p = 0; // 指数累加器
            int j = 0; // 十进制小数位数计数器
            int e = 1; // 记录十进制数的符号
            String CJ1; //记录类型
            float Cj2;//最后得到的数
            for (int i = 0; i < strings.length(); i++) {
                char ch = strings.charAt(i);//得到字符
                int d;
                if (i == 0) {
                    if (ch > 48 && ch < 58) { //数字  1-9
                        d = ch - 48; //数值 => d
                        w = w * 10 + d; //w*10+d=>w
                    } else {
                        //第一个数字不是1-9结束
                        System.out.println("error!");
                        return;
                    }
                } else {
                    //处理第一位后边的
                    if (ch > 47 && ch < 58) { //数字  0-9
                        d = ch - 48; //数值 => d
                        w = w * 10 + d; //w*10+d=>w
                    } else {
                        //有小数点的情况
                        if (ch == '.') {  //是否是小数点
                            i++;
                            ch = strings.charAt(i); //取下一个字符
                            if (ch < 48 || ch > 57) { //不是数字
                                System.out.println("error!");
                                return;
                            } else { //数字 0-9
                                do {
                                    d = ch - 48; //数值 => d
                                    w = w * 10 + d; //w*10+d=>w
                                    j += 1; //j+1=>j
                                    i++;
                                    ch = strings.charAt(i); //取下一个字符
                                } while (ch > 47 && ch < 58);
                                if (ch == 'E') { //是'E'否
                                    i++;
                                    ch = strings.charAt(i); //取下一个字符
                                    if (ch == '-') { //是'-'否
                                        e = -1;
                                        i++;
                                        ch = strings.charAt(i); //取下一个字符
                                    } else if (ch == '+') { //是'+'否
                                        i++;
                                        ch = strings.charAt(i); //取下一个字符
                                    }

                                    if (ch < 48 || ch > 58) { //不是数字
                                        System.out.println("error!");
                                        return;
                                    } else {
                                        do {
                                            d = ch - 48; //数值 => d
                                            p = p * 10 + d; //p*10+d=>p
                                            i++;
                                            ch = strings.charAt(i); //取下一个字符
                                        } while (ch > 47 && ch < 58);

                                        CJ1 = "实型";
                                        Cj2 = (float) (w * Math.pow(10.0, e * p - j));
                                        System.out.println("输入数据有小数点和E和数字，类型为" + CJ1 + "，值为" + Cj2);
                                        return;
                                    }
                                } else {
                                    CJ1 = "实型";
                                    Cj2 = (float) (w * Math.pow(10.0, e * p - j));
                                    System.out.println("输入数据只有小数点和数字，类型为" + CJ1 + "，值为" + Cj2);
                                    return;
                                }
                            }
                        } else {
                            if (ch == 'E') {  //是否是E
                                i++;
                                ch = strings.charAt(i); //取下一个字符
                                if (ch == '-') { //是'-'否
                                    e = -1;
                                    i++;
                                    ch = strings.charAt(i); //取下一个字符
                                } else if (ch == '+') { //是'+'否
                                    i++;
                                    ch = strings.charAt(i); //取下一个字符
                                }
                                if (ch < 48 || ch > 58) { //不是数字
                                    System.out.println("error!");
                                    return;
                                } else {
                                    do {
                                        d = ch - 48; //数值 => d
                                        p = p * 10 + d; //p*10+d=>p
                                        i++;
                                        ch = strings.charAt(i); //取下一个字符
                                    } while (ch > 47 && ch < 58);
                                    CJ1 = "实型";
                                    Cj2 = (float) (w * Math.pow(10.0, e * p - j));
                                    System.out.println("输入数据只有e和数字，类型为" + CJ1 + "，值为" + Cj2);
                                    return;
                                }
                            } else {
                                CJ1 = "整型";
                                Cj2 = (float) (w * Math.pow(10.0, e * p - j));
                                System.out.println("输入数据只有数字，类型为" + CJ1 + "，值为" + Cj2);
                            }
                        }
                    }
                }
            }
        }
    }
}
