import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {

        String json = "{\n" +
                "  \"resourceType\": \"Patient\",\n" +
                "  \"id\": \"f001\",\n" +
                "  \"text\": {\n" +
                "    \"status\": \"generated\",\n" +
                "    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Generated Narrative with Details</b></p><p><b>id</b>: f001</p><p><b>identifier</b>: 738472983 (USUAL), ?? (USUAL)</p><p><b>active</b>: true</p><p><b>name</b>: Pieter van de Heuvel </p><p><b>telecom</b>: ph: 0648352638(MOBILE), p.heuvel@gmail.com(HOME)</p><p><b>gender</b>: male</p><p><b>birthDate</b>: 17/11/1944</p><p><b>deceased</b>: false</p><p><b>address</b>: Van Egmondkade 23 Amsterdam 1024 RJ NLD (HOME)</p><p><b>maritalStatus</b>: Getrouwd <span>(Details : {http://hl7.org/fhir/v3/MaritalStatus code 'M' = 'Married', given as 'Married'})</span></p><p><b>multipleBirth</b>: true</p><h3>Contacts</h3><table><tr><td>-</td><td><b>Relationship</b></td><td><b>Name</b></td><td><b>Telecom</b></td></tr><tr><td>*</td><td>Emergency Contact <span>(Details : {http://hl7.org/fhir/v2/0131 code 'C' = 'Emergency Contact)</span></td><td>Sarah Abels </td><td>ph: 0690383372(MOBILE)</td></tr></table><h3>Communications</h3><table><tr><td>-</td><td><b>Language</b></td><td><b>Preferred</b></td></tr><tr><td>*</td><td>Nederlands <span>(Details : {urn:ietf:bcp:47 code 'nl' = 'Dutch', given as 'Dutch'})</span></td><td>true</td></tr></table><p><b>managingOrganization</b>: <a>Burgers University Medical Centre</a></p></div>\"\n" +
                "  },\n" +
                "  \"identifier\": [\n" +
                "    {\n" +
                "      \"use\": \"usual\",\n" +
                "      \"system\": \"urn:oid:2.16.840.1.113883.2.4.6.3\",\n" +
                "      \"value\": \"738472983\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"use\": \"usual\",\n" +
                "      \"system\": \"urn:oid:2.16.840.1.113883.2.4.6.3\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"active\": true,\n" +
                "  \"name\": [\n" +
                "    {\n" +
                "      \"use\": \"official\",\n" +
                "      \"family\": \"van de Heuvel\",\n" +
                "      \"given\": [\n" +
                "        \"Pieter\"\n" +
                "      ],\n" +
                "      \"suffix\": [\n" +
                "        \"MSc\"\n" +
                "      ]\n" +
                "    }\n" +
                "  ],\n" +
                "  \"telecom\": [\n" +
                "    {\n" +
                "      \"system\": \"phone\",\n" +
                "      \"value\": \"0648352638\",\n" +
                "      \"use\": \"mobile\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"system\": \"email\",\n" +
                "      \"value\": \"p.heuvel@gmail.com\",\n" +
                "      \"use\": \"home\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"gender\": \"male\",\n" +
                "  \"birthDate\": \"1944-11-17\",\n" +
                "  \"deceasedBoolean\": false,\n" +
                "  \"address\": [\n" +
                "    {\n" +
                "      \"use\": \"home\",\n" +
                "      \"line\": [\n" +
                "        \"Van Egmondkade 23\"\n" +
                "      ],\n" +
                "      \"city\": \"Amsterdam\",\n" +
                "      \"postalCode\": \"1024 RJ\",\n" +
                "      \"country\": \"NLD\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"maritalStatus\": {\n" +
                "    \"coding\": [\n" +
                "      {\n" +
                "        \"system\": \"http://hl7.org/fhir/v3/MaritalStatus\",\n" +
                "        \"code\": \"M\",\n" +
                "        \"display\": \"Married\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"text\": \"Getrouwd\"\n" +
                "  },\n" +
                "  \"multipleBirthBoolean\": true,\n" +
                "  \"contact\": [\n" +
                "    {\n" +
                "      \"relationship\": [\n" +
                "        {\n" +
                "          \"coding\": [\n" +
                "            {\n" +
                "              \"system\": \"http://hl7.org/fhir/v2/0131\",\n" +
                "              \"code\": \"C\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"coding\": [\n" +
                "            {\n" +
                "              \"system\": \"http://hl7.org/fhir/v2/0132\",\n" +
                "              \"code\": \"B\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": {\n" +
                "        \"use\": \"usual\",\n" +
                "        \"family\": \"Abels\",\n" +
                "        \"given\": [\n" +
                "          \"Sarah\"\n" +
                "        ]\n" +
                "      },\n" +
                "      \"telecom\": [\n" +
                "        {\n" +
                "          \"system\": \"phone\",\n" +
                "          \"value\": \"0690383372\",\n" +
                "          \"use\": \"mobile\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ],\n" +
                "  \"communication\": [\n" +
                "    {\n" +
                "      \"language\": {\n" +
                "        \"coding\": [\n" +
                "          {\n" +
                "            \"system\": \"urn:ietf:bcp:47\",\n" +
                "            \"code\": \"nl\",\n" +
                "            \"display\": \"Dutch\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"text\": \"Nederlands\"\n" +
                "      },\n" +
                "      \"preferred\": true\n" +
                "    }\n" +
                "  ],\n" +
                "  \"managingOrganization\": {\n" +
                "    \"reference\": \"Organization/f001\",\n" +
                "    \"display\": \"Burgers University Medical Centre\"\n" +
                "  }\n" +
                "}\n";

        FhirContext ctx = FhirContext.forDstu2();

        File initialFile = new File("src/resources/PatientSTU3.json");
        InputStream patientStream = new FileInputStream(initialFile);


        Patient patient = (Patient) ctx.newJsonParser().parseResource(patientStream);

        String patientInJSON = ctx.newJsonParser().encodeResourceToString(patient);

        FileWriter fw = new FileWriter("src/resources/Parsed.json");
        fw.write(patientInJSON);
        fw.close();

        System.out.println("*******************************************json***************************************");
        System.out.println(json);


        System.out.println("***************************************patientInXML*****************************************");
        String patientInXML = ctx.newXmlParser().encodeResourceToString(patient);
        System.out.println(patientInXML);


    }

}
