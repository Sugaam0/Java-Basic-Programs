package MoreJavaProblems;




 class Storage {
    private boolean ssd;
    private int capacity;

    public Storage(boolean ssd, int capacity)
        {
            this.ssd = ssd;
            this.capacity = capacity;
        }
    public String toString()
        {
            String d = (this.ssd ? "It is ssd" : "It is hdd") + "capacity  = " + this.capacity;
            return d;
        }
}


class Computer 
    {
        private String brand;
        private int price;
        private Storage str;

        public Computer(String brand, int price, Storage str)
            {
                this.brand = brand;
                this.price =price;
                this.str =str;
            }
        public String toString()
            {
                return "\nBrand = " + this.brand + "\n Price = " + this.price + "\n" + "Storage = " + this.str;

            }
    }

    class Test 
    {
        public static void main(String[] args) {
            Storage s = new Storage(true, 2);

            Computer c= new Computer("Dell", 10000, s);

            System.out.println(c);
        }
    }