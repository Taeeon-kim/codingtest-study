function solution(phone_number){
    var star=''
   
       star='*'.repeat(phone_number.length-4)
  
    return star+phone_number.slice(-4)
}