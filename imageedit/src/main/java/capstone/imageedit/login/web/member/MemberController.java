package capstone.imageedit.login.web.member;

import capstone.imageedit.login.domain.member.Member;
import capstone.imageedit.login.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
//@RequestMapping("members")
public class MemberController {

    private final MemberRepository memberRepository;

    @GetMapping("/signUp")
    public String addForm(@ModelAttribute("member") Member member) {
        return "members/addMemberForm";
    }

//    @PostMapping("/add")
//    public String save(@Valid @ModelAttribute Member member, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "members/addMemberForm";
//        }
//
//        memberRepository.save(member);
//        return "redirect:/";
//    }
}