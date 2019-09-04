import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.dstu2.resource.Patient;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {

        FhirContext ctx = FhirContext.forDstu2();

        File initialFile = new File("src/resources/PatientSTU3.json");
        InputStream patientStream = new FileInputStream(initialFile);


        Patient patient = (Patient) ctx.newJsonParser().parseResource(patientStream);

        String patientInJSON = ctx.newJsonParser().encodeResourceToString(patient);

        FileWriter fw = new FileWriter("src/resources/Parsed.json");
        fw.write(patientInJSON);
        fw.close();

        System.out.println("***************************************patientInJSON*****************************************");
        System.out.println(patientInJSON);

        System.out.println("***************************************patientInXML*****************************************");
        String patientInXML = ctx.newXmlParser().encodeResourceToString(patient);
        System.out.println(patientInXML);


    }

}
