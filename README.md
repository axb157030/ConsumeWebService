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
![image](https://user-images.githubusercontent.com/15826152/128638010-5919be74-4675-47ec-ab5e-9b3c59a4f04a.png)

