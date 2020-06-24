package gov.gtas.summary;

import java.util.Date;


public class PassengerDocument {
    private String documentType;

    private String documentNumber;

    private Date expirationDate;

    private Date issuanceDate;

    private String issuanceCountry;

    private String messageType;

    private Long flightId;

    private Long passengerId;

    private Integer numberOfDaysValid;

    private String flightTagId;

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getIssuanceDate() {
        return issuanceDate;
    }

    public void setIssuanceDate(Date issuanceDate) {
        this.issuanceDate = issuanceDate;
    }

    public String getIssuanceCountry() {
        return issuanceCountry;
    }

    public void setIssuanceCountry(String issuanceCountry) {
        this.issuanceCountry = issuanceCountry;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public Long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Long passengerId) {
        this.passengerId = passengerId;
    }

    public Integer getNumberOfDaysValid() {
        return numberOfDaysValid;
    }

    public void setNumberOfDaysValid(Integer numberOfDaysValid) {
        this.numberOfDaysValid = numberOfDaysValid;
    }

    public String getFlightTagId() {
        return flightTagId;
    }

    public void setFlightTagId(String flightTagId) {
        this.flightTagId = flightTagId;
    }
}
