class averageCalc<T extends Number>
{
    T[] array;
    averageCalc(T[] array)
    {
        this.array = array.clone();
    }

    double getAvg()
    {
        double sum = 0;
        for(int i=0; i<array.length; i++)
        {
            sum = sum + array[i].doubleValue();
        }
        return sum / array.length;
    }

    void printAvg()
    {
        double sum = 0;
        for(int i=0; i<array.length; i++)
        {
            sum = sum + array[i].doubleValue();
        }
        System.out.println(sum / array.length);
    }


    public static void main(String[] args) {

        Integer[] integerArray = {10, 12, 43, 35};
        averageCalc<Integer> integerAverage = new averageCalc<>(integerArray);

        Double[] darr = {2.4, 3.6, 7.8, 23.9};
        averageCalc<Double> doubleAverage = new averageCalc<>(darr);

        System.out.println("Int avg: "+ integerAverage.getAvg());
        integerAverage.printAvg();
        System.out.println("Double avg: "+ doubleAverage.getAvg());
        doubleAverage.printAvg();

    }

}
