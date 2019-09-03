import ca.uhn.fhir.context.FhirVersionEnum;
import org.hl7.fhir.instance.model.api.IBaseMetaType;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.instance.model.api.IIdType;

import java.util.List;

public class Person implements IBaseResource {
    public Person(String stanislav, String zhuravel, String male) {
    }

    @Override
    public IBaseMetaType getMeta() {

        return null;
    }

    @Override
    public IIdType getIdElement() {
        return null;
    }

    @Override
    public IBaseResource setId(IIdType theId) {
        return null;
    }

    @Override
    public FhirVersionEnum getStructureFhirVersionEnum() {
        return FhirVersionEnum.DSTU2;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean hasFormatComment() {
        return false;
    }

    @Override
    public List<String> getFormatCommentsPre() {
        return null;
    }

    @Override
    public List<String> getFormatCommentsPost() {
        return null;
    }

    @Override
    public String fhirType() {
        return null;
    }

    private String id;

    private String firstName;

    private String lastName;

    private String gender;

    public String getId() {
        return id;
    }

    public IBaseResource setId(String id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
