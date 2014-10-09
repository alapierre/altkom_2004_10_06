/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.sping.batch.sample.writter;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.file.ResourceAwareItemWriterItemStream;
import org.springframework.batch.item.support.AbstractItemStreamItemWriter;
import org.springframework.core.io.Resource;
import pl.com.softproject.utils.excelexporter.ColumnDescriptor;
import pl.com.softproject.utils.excelexporter.ExcelExporter;

/**
 *
 * @author admin
 */
public class ExcelExporterItemWriter<T> extends AbstractItemStreamItemWriter<T> implements ResourceAwareItemWriterItemStream<T>{

   
    private Logger logger = Logger.getLogger("");
    
    private Resource resource;
    private String[] propertiesNames;
    private ExcelExporter exporter;
    private String sheetName;
    
    @Override
    public void open(ExecutionContext executionContext) {
        exporter = new ExcelExporter(sheetName);
        initColumns();
    }

    protected void initColumns() {
        
        for(String propName : propertiesNames) {
            exporter.addColumn(new ColumnDescriptor(propName, propName));
        }
        
    }
            
    
    @Override
    public void close() {
        try {
            exporter.autoSizeAllColumns();
            File f = resource.getFile();
            logger.debug("ouptput file " + f);
            exporter.save(f);
        } catch (IOException ex) {
            throw new IllegalStateException("Problem z zapisem pliku xls", ex);
        }
    }

    
    
    @Override
    public void write(List<? extends T> items) throws Exception {
        
        for(T item : items) {
            exporter.createRow(item);
        }
        
    }

    @Override
    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void setPropertiesNames(String[] propertiesNames) {
        this.propertiesNames = propertiesNames;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }
    
    
}
