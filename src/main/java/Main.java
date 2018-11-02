public class Main {

    public static void main(String[] args) {
        String soapEndpointUrl = "https://www.w3schools.com/xml/tempconvert.asmx";
        String soapAction = "https://www.w3schools.com/xml/CelsiusToFahrenheit";

        SOAPClientSAAJ.callSoapWebService(soapEndpointUrl, soapAction);
    }
}
