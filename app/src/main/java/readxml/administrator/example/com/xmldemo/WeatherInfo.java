package readxml.administrator.example.com.xmldemo;

/**
 * Created by pc on 2017/12/30.
 */

 class WeatherInfo {
    String date;
    String high;
    String low;
    W day;
    W night;
}
class W{
    String type;
    String fengli;
    String fengxiang;
    public String info(){
        String str=type+"风向"+fengxiang+"风力"+fengli;
        return str;
    }
}
