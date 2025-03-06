package Generics;

public class GenericClassExample {
    public static void main(String[] args) {
//        Product<Integer,String> prod = new Product(121,"soap");
//        System.out.println(prod.productID);
//        System.out.println(prod.productDescription);
//
//        Product<String,String> prod2 = new Product("a","soap");
//        System.out.println(prod2.productID);
//        System.out.println(prod2.productDescription);
        Mapping<Integer,String> map = new Mapping(1,"Ms_Dhoni");
        System.out.println(map);
        int key = map.getK();
        String value = map.getV();
        System.out.println(key + " " + value);
    }

    static class Product<product,Description> {
        private product productID;
        private Description productDescription;

        public Product(product productID, Description productDescription) {
            this.productID = productID;
            this.productDescription = productDescription;
        }

        public Description getProductDescription() {
            return productDescription;
        }

        public product getProductID() {
            return productID;
        }

        public void setProductDescription(Description productDescription) {
            this.productDescription = productDescription;
        }

        public void setProductID(product productID) {
            this.productID = productID;
        }
    }

    static class Mapping<K,V> {
        private K k;
        private V v;

        public Mapping(K k, V v) {
            this.k = k;
            this.v = v;
        }

        public K getK() {
            return k;
        }

        public V getV() {
            return v;
        }

        public void setK(K k) {
            this.k = k;
        }

        public void setV(V v) {
            this.v = v;
        }

        @Override
        public String toString() {
            return "Mapping{" +
                    "k=" + k +
                    ", v=" + v +
                    '}';
        }

    }

}

