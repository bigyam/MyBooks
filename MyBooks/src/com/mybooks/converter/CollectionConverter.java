//package com.mybooks.converter;
//
//import javax.faces.component.UIComponent;
//import javax.faces.context.FacesContext;
//import javax.faces.convert.Converter;
//import javax.faces.convert.ConverterException;
//import javax.inject.Inject;
//import javax.inject.Named;
//
//import org.springframework.web.context.annotation.RequestScope;
//
//import com.mybooks.entities.BookCollection;
//import com.mybooks.service.BookCollectionService;
//import com.mybooks.service.BookEntryService;
//
//@Named
//@RequestScope
//public class CollectionConverter implements Converter {
//
//    @Inject
//    private BookEntryService bookEntryService;
//
//    @Override
//    public Object getAsObject(FacesContext context, UIComponent component, String value) {
//        if (value == null || value.isEmpty()) {
//            return null;
//        }
//
//        try {
//            Integer id = Integer.valueOf(value);
//            return bookEntryService.fetchAllByColId(id);
//        } catch (NumberFormatException e) {
//            throw new ConverterException("The value is not a valid Product ID: " + value, e);
//        }
//    }
//
//    @Override    
//    public String getAsString(FacesContext context, UIComponent component, Object value) {        
//        if (value == null) {
//            return "";
//        }
//
//        if (value instanceof BookCollection) {
//            int id = ((BookCollection) value).getBookColId();
//            return String.valueOf(id);
//        } else {
//            throw new ConverterException("The value is not a valid Product instance: " + value);
//        }
//    }
//}
