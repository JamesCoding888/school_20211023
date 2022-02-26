package com.study.day9;
class school  {
    class A{
        void show(){
            System.out.println("inner class A");
        }
    }
    class B{
        class C{
            class D{
                void innerClass(){
                    System.out.println("inner class D");
                }
                void show(){
                    System.out.println("method of inner class D");
                }
            }
            
        }
    }
    public static void main(String[] args) {
        new school().new A().show();
        System.out.println("內部類別 A 的記憶體位置: " + new school().new A());                
        new school().new B().new C().new D().show();
        System.out.println("內部類別 D 的記憶體位置: " + new school().new B().new C().new D());  
        
        school.B.C.D d = new school().new B().new C().new D();
        d.innerClass();
    }
}
