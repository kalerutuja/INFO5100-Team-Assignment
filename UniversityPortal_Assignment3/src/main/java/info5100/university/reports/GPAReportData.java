/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.reports;

/**
 *
 * @author Surbhi
 */
public class GPAReportData {
    
    SubReportDTO subReportDTO;
    GradeRange gradeRange;

    public GPAReportData(SubReportDTO subReportDTO, GradeRange gradeRange) {
        this.subReportDTO = subReportDTO;
        this.gradeRange = gradeRange;
    }

    public SubReportDTO getSubReportDTO() {
        return subReportDTO;
    }

    public void setSubReportDTO(SubReportDTO subReportDTO) {
        this.subReportDTO = subReportDTO;
    }

    public GradeRange getGradeRange() {
        return gradeRange;
    }

    public void setGradeRange(GradeRange gradeRange) {
        this.gradeRange = gradeRange;
    }
     
}
