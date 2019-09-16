import ca.uhn.fhir.context.FhirContext;
import org.hl7.fhir.dstu3.model.Bundle;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        FhirContext ctx = FhirContext.forDstu3();


        String rededBundle = new String(Files.readAllBytes(Paths.get("src/resources/Albert.json")));

        Bundle bundle = ctx.newJsonParser().parseResource(Bundle.class, rededBundle);

        String Pxml = ctx.newXmlParser().encodeResourceToString(bundle);

        FileWriter fw = new FileWriter("src/resources/Parsed.xml");
        fw.write(Pxml);
        fw.close();


    }

}
