public class property {
    public property(){
        String name;
        int price;
        boolean isOwned;

        public void property(){
            this.name = name;
            this.price = price;
            this.isOwned = isOwned;
        }

        @Override
        public String toString(){
            String owned;
            if(isOwned == true){
                owned = "owned";
            }
            else{
                owned = "not owned";
            }
            return name + " $" + price + " Is it owned? " + status;
        }
    }
}
