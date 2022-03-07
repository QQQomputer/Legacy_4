/**
 * 
 */

const checkAll =document.getElementById('checkAll');
const check = document.getElementsByClassName('check');
const btn = document.getElementById('btn');

checkAll.addEventListener("click", function(){
    if(checkAll.checked){
        for(ch of check){
            ch.checked=true;
        }
    }else{
        for(ch of check){
            ch.checked=false;
        }
    }
})

for(ch of check){
    ch.addEventListener("click", function(){
        if(!this.checked){
            checkAll.checked=false;
        }
        if(check[0].checked && check[1].checked && check[2].checked && check[3].checked){
            checkAll.checked=true;
        }
    })
}

btn.addEventListener("click", function(){
    if(checkAll.checked){
        location.href="./join";
    }else{
        alert("약관 동의가 필요합니다.");
    }
})


