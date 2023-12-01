class NewSwtich
{
    void main()
    {
        //After java 5 String is allowed
        String day = "Monday";
        String result = "";
        
        result = switch(day)
        {
            case "Saturday", "Sunday": yield "6am";
            case "Monday": yield "8am";
            default: yield "7am";
        };
    }
}