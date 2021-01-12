package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    // TODO: At localhost:8080, add text that states the three possible
    //  programming languages someone could be working on.
    //  You need to have an h1 with the title “Skills Tracker”,
    //  an h2, and an ol containing three programming languages of your choosing.
    @GetMapping

    public String languages() {
        return
                "<html>" +
                       "<h1>" + "Skills Tracker" +"</h1>"+
                        "<h2>" + "Languages to learn..." +"</h2>"+
                        "<ol>" +
                        "<li>" + "Python" + "</li>" +
                        "<li>" + "Javascript" + "</li>" +
                        "<li>" + "Java" + "</li>" +
                        "</ol>"+
                        "</html>";
    }

    // TODO: At localhost:8080/form, add a form that lets the user enter their name and choose their favorite,
    //  second favorite, and third favorite programming languages on your list.
    //  Use select elements for each of the rankings. Just as with the exercises, we will use @GetMapping().
    // TODO: Also at localhost:8080/form, use @PostMapping and @RequestParam to update the HTML with an h1 stating the
    //  user’s name and an ol showing the three programming languages in the order they chose.
    @GetMapping("form")

    public String renderForm() {
        return "<form method='post'>" +
                "Name: <input type='text' name='name' /><br>" +
                "Favorite Language: <select name = firstChoice>" +
                "<option value ='Python'>Python</option>" +
                "<option value ='Javascript'>Javascript</option>" +
                "<option value ='Java'>Java</option>" +
                "</select><br>" +
                "Second Favorite Language: <select name = secondChoice>" +
                "<option value ='Python'>Python</option>" +
                "<option value ='Javascript'>Javascript</option>" +
                "<option value ='Java'>Java</option>" +
                "</select><br>" +
                "Third Favorite Language: <select name = thirdChoice>" +
                "<option value ='Python'>Python</option>" +
                "<option value ='Javascript'>Javascript</option>" +
                "<option value ='Java'>Java</option>" +
                "</select><br>" +
                "<input type='submit'/>"+
                "</form>";
    }


    @PostMapping("form")
    public String inputForm(@RequestParam String name,
                            @RequestParam String firstChoice,
                            @RequestParam String secondChoice,
                            @RequestParam String thirdChoice){
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>";
    }
}
