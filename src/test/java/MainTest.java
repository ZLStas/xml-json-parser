//import ca.uhn.fhir.context.FhirContext;
//import ca.uhn.fhir.model.dstu2.resource.Patient;
//import ca.uhn.fhir.parser.IParser;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class MainTest {
//
//    private static IParser jsonParser;
//
//    private static IParser xmlParser;
//
//    private static InputStream patientStream;
//
//    private static File initialFile = new File("src/resources/PatientSTU3.json");
//
//    @BeforeAll
//    public static void init() {
//        FhirContext ctx = FhirContext.forR4();
//        jsonParser = ctx.newJsonParser();
//        xmlParser = ctx.newXmlParser();
//    }
//
//    @BeforeEach
//    public void readResource() {
//        try {
//            patientStream = new FileInputStream(initialFile);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @AfterEach
//    public void closeResource() {
//        try {
//            patientStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void resource() {
//        Patient patient = (Patient) jsonParser.parseResource(patientStream);
//
//        patient.setActive(false);
//
//        assertThat(patient.getActive()).isFalse();
//    }
//
//
//    @Test
//    public void jsonParser() {
//           Patient patient = (Patient) jsonParser.parseResource(patientStream);
//
//         String xmlEncodedPatient = xmlParser.encodeResourceToString(patient);
//
//        Patient recreatedFromXmlPatient = (Patient) xmlParser.parseResource(xmlEncodedPatient);
//
//        //  assertThat(patient).isEqualTo(recreatedFromXmlPatient);
//    }
//
//
//}
