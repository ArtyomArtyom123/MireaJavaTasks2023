public enum Season {
    WINTER(-10.0f),
    SPRING(10.0f),
    SUMMER(25.0f){
        @Override
        public String getDescription()
        {
            return "Warm season of the year";
        }
    },
    AUTUMN(5.0f);
    private final float temp;
    private Season(float temp){
        this.temp = temp;
    }
    public float getTemp(){
        return temp;
    }
    public String getDescription(){
        return "Cold season of the year";
    }
}

