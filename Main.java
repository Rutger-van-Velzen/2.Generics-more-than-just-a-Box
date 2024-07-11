public class Main {
    public static void main(String... args){
        example_1();
        example_2();
        example_3();
    }




    static void example_1(){
        Box_1<Integer> box = new Box_1<>();
        box.setValue(101);

        box.printString();
    }

    static class Box_1<T>{
        private T t;

        public void setValue(T t){
            this.t = t;
        }

        public T getValue(){
            return t;
        }

        public void printString(){
            System.out.println(t.toString());
        }
    }






    static void example_2(){
        Box_2<Integer> box = new Box_2<>();
        box.setValue(101);

        box.printDoubleValue();

        Integer value = box.getValue();
    }

    static class Box_2<T extends Number>{
        private T t;

        public void setValue(T t){
            this.t = t;
        }

        public T getValue(){
            return t;
        }

        public void printDoubleValue(){
            System.out.println(t.doubleValue()); // Prints: <<101.0>>
        }
    }




    static void example_3(){
        Box_3 box = new Box_3();
        box.setValue(101);

        box.printDoubleValue();

        Integer value = (Integer) box.getValue();
    }

    static class Box_3{
        private Number number;

        public void setValue(Number number){
            this.number = number;
        }

        public Number getValue(){
            return number;
        }

        public void printDoubleValue(){
            System.out.println(number.doubleValue()); // Prints: <<101.0>>
        }
    }
}

