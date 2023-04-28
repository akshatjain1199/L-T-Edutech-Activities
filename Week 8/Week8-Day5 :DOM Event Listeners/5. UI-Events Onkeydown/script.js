function showGamePage()
{
    var id=document.getElementById("instruction").style.display="none";
    var id2=document.getElementById("gamePage").style.display="block";
    document.onkeydown = function(event) {
    var letter = String.fromCharCode(event.keyCode);
    document.getElementById('typedWord').innerHTML += letter.toUpperCase();
    }

}
