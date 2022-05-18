package com.example.reggie_a.dto;

import com.example.reggie_a.enity.Setmeal;
import com.example.reggie_a.enity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
