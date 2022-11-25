package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String name;
    private String father_lastname;
    private String mother_lastname;
    private String rfc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_paterno")
    public String getFatherLastName() {
        return father_lastname;
    }

    public void setFatherLastName(String father_lastname) {
        this.father_lastname = father_lastname;
    }

    @ColumnName("apellido_materno")
    public String getMotherLastName() {
        return mother_lastname;
    }

    public void setMotherLastName(String mother_lastname) {
        this.mother_lastname = mother_lastname;
    }

    @ColumnName("RFC")
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

}