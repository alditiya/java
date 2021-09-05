class Wolf extends Animal {

    //jika kita tidak override method yang abstrak akan error
    //karena method ini method abstract di parent class
    public void makeNoise() {
        System.out.println("AUW AUW");
    }
}
