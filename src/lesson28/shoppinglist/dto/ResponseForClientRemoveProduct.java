package lesson28.shoppinglist.dto;

import lesson28.shoppinglist.dto.error.ErrorDto;

import java.util.List;

public class ResponseForClientRemoveProduct {


    private String message;
    private List<ErrorDto> errorDtoList;

    public ResponseForClientRemoveProduct(String message, List<ErrorDto> errorDtoList) {
        this.message = message;
        this.errorDtoList = errorDtoList;
    }

    public String getMessage() {
        return message;
    }

    public List<ErrorDto> getErrorDtoList() {
        return errorDtoList;
    }

    @Override
    public String toString() {
        return "ResponseForClientRemoveProduct{" +
                "message='" + message + '\'' +
                ", errorDtoList=" + errorDtoList +
                '}';
    }
}
