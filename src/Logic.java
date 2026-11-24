public class Logic{
    public void run(){
        CelsiusToFahrenheit converter = new CelsiusToFahrenheit();
        menu M = new menu();
        int choice = M.GetChoice();
        double value = M.GetTemperature();
        double result;
        String unit;
        switch(choice){
            case 1 ->{ result = converter.Con1(value);  unit = "Fahrenheit"; }
            case 2 ->{ result = converter.Con2(value); unit = "Celsius"; }
            case 3 ->{ result = converter.Con3(value); unit = "Celsiust"; }
            default ->{System.out.print("invalid option"); return;}
        }
        System.out.print( unit + ":" + result);
    }
}