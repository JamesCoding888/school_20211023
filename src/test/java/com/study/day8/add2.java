package com.study.day8;

class add2 implements apple
{

    @Override
    public double bookPrice(double price) {
        return price;
    }

    @Override
    public double book1Price(double price) {
        return price;
    }
    

	public static void main(String[] args) {
            student s = new A1("apple", 10);
            System.out.println(s.show());            
            System.out.println(s.setChi(2));
            System.out.println(new add2().book1Price(123));
            System.out.println(apple.bookPrice2(100));
        }
}