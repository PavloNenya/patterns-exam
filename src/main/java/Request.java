public class Request {
    private boolean hasVacancy;
    private boolean documentsValid;
    private boolean approvedByChairman;
    private boolean approvedByDean;
    private boolean hasFunding;

    public boolean isHasVacancy() { return hasVacancy; }
    public void setHasVacancy(boolean hasVacancy) { this.hasVacancy = hasVacancy; }

    public boolean isDocumentsValid() { return documentsValid; }
    public void setDocumentsValid(boolean documentsValid) { this.documentsValid = documentsValid; }

    public boolean isApprovedByChairman() { return approvedByChairman; }
    public void setApprovedByChairman(boolean approvedByChairman) { this.approvedByChairman = approvedByChairman; }

    public boolean isApprovedByDean() { return approvedByDean; }
    public void setApprovedByDean(boolean approvedByDean) { this.approvedByDean = approvedByDean; }

    public boolean isHasFunding() { return hasFunding; }
    public void setHasFunding(boolean hasFunding) { this.hasFunding = hasFunding; }
}
