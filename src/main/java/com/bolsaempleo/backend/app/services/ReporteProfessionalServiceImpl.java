package com.bolsaempleo.backend.app.services;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsaempleo.backend.app.dto.ReporteProfessionalDto;
import com.bolsaempleo.backend.app.reports.JasperReportManager;
import com.bolsaempleo.backend.app.utility.TipoReporteEnum;
import net.sf.jasperreports.engine.JRException;
import java.io.ByteArrayOutputStream;
import javax.sql.DataSource;


@Service
public class ReporteProfessionalServiceImpl implements ReporteProfessionalService{

    @Autowired
	private JasperReportManager reportManager;

	@Autowired
	private DataSource dataSource;

    @Override
    @Transactional(readOnly = true )
    public ReporteProfessionalDto obtenerReporteProfessional(Map<String, Object> params)
			 throws JRException, IOException, SQLException {
		
			
				String fileName = "Professional";
					ReporteProfessionalDto dto = new ReporteProfessionalDto();
					String extension = params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name()) ? ".xlsx"
							: ".pdf";
					dto.setFileName(fileName + extension);
			try {
					ByteArrayOutputStream stream = reportManager.export(fileName, params.get("tipo").toString(), params,
							dataSource.getConnection());

					byte[] bs = stream.toByteArray();
					dto.setStream(new ByteArrayInputStream(bs));
					dto.setLength(bs.length);

					
			} catch (Exception e) {
			 System.out.println("Mensaje de la excepcion: " + e);
			}
			return dto;
	}
	
}