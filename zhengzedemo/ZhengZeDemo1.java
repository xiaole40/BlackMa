package BlackMa.com.lele.zhengzedemo;

public class ZhengZeDemo1 {
    public static void main(String[] args) {
        /*
        * 假如现在要求效验一个QQ号是否正确
        * 规则：6位及20位之内，0不能在开头，必须都是数字
        * 先使用目前所学知识完成效验需求
        * 然后体验一下正则表达式检验
        * */

        String qq = "012345678";
        //System.out.println(checkQQ(qq));//false


        System.out.println(qq.matches("[1-9]\\d{5,19}"));//fasle

    }

    public static boolean checkQQ(String qq){
        //核心思想：
        //先把异常数据进行过滤
        //下面的就是满足要求的数据了
        int len = qq.length();
        if (len < 6 || len > 20){
            return false;
        }
        //0不能在开头
        if(qq.startsWith("0")){
            return  false;
        }
        //必须全部是数字
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
}
