# ConsumeWebService

It consumes a SOAP web service that runs on port 8081. It finds more information of a specific state of the U.S that by its abbreviation that the SOAP web service it consumes has information of.
<p>This <a href="https://www.youtube.com/watch?v=SiFSNtDAIS0">SOAP Web service that this application consumes can be made following this video</a><p>
<p> Please make sure to configure the SOAP Web service to port 8081</p>


Enter this, `http://localhost:8080/GetState/TN` after running the application.
#### Result of running `http://localhost:8080/GetState/TN`
`{
    "state": {
        "id": "TN",
        "name": "Tamilnadu",
        "population": 52000000,
        "capital": "Chennai",
        "language": "Tamil"
    }
}`

### Blog
Soap web service accepts a payload that is turned from Java to XML. Class of payload should have @XML annotations such @XMLRootElement. The marshallers and unmarshallers that turn the java object to XML and vice versa, should be set and configured. The [WSDL] of the SOAP Web Service should be [present in application].  [The Soap Client should be configured]
Invoking the SOAP web service is like invoke a RESTful web service but with a little different syntax to call it and the payload has to come from a package that the marshaller.

