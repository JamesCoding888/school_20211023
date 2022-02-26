package com.study.day11;

class check extends Exception{ // 自定義 check exception 來處理，請注意，check 本身沒有 exception 中斷的機制，所以需要繼承 e.g. Exception 產生一個中斷的機制
    check(String errorMsg){
        System.out.println(errorMsg);
    }
}

public class Order {
    private String name;
    private int Ram;
    private int Lcd;
    private int Sum;
    public Order(String name, int Ram, int Lcd) throws check /*不用 throws Exception 避免debug不曉得哪一個錯誤 */
    {
        if(Ram>=0 && Lcd >= 0){
            this.name = name;
            this.Ram = Ram;
            this.Lcd = Lcd;
            this.Sum = Ram * 765 + Lcd * 4999;
        } else{
            //throw new Exception(); // 不用 throw new Exception() 避免debug不曉得哪一個錯誤
            throw new check("新增 Ram 與 Lcd 需 >=0");
            /* 
            try{
                throw new Exception();
            } catch(Exception e){
            
            }
            */
        }
    }
    public void setRam(int Ram) throws check{ // setRam method 丟出 Exception or check
        if(Ram>=0){
            this.Ram = Ram;    
        }
        else {
            //throw new Exception(); // 丟出 Exception 須由 setRam method 處理
            throw new check("修改 Ram 需 >=0"); // 不用 throw new Exception() 避免debug不曉得哪一個錯誤
        }
        
    }
    public void setLcd(int Lcd) throws check{ // setLcd method 丟出 Exception or check
        if(Lcd>=0){
            this.Lcd = Lcd;
        }
        else {
            //throw new Exception(); // 丟出 Exception 須由 setRam method 處理
            throw new check("修改 Lcd 需 >=0"); // 不用 throw new Exception() 避免debug不曉得哪一個錯誤
        }
        
    }
    
    public void show(){
        Sum = Ram * 765 + Lcd * 4999;
        System.out.println("名:"+name+
			"\tRam:"+Ram+
			"\tLcd:"+Lcd+
			"\tSum:"+Sum);
    }
}







