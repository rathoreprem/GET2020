String.prototype.repeatify = function(repeatation) {
    let i, string = "";
    for (i = 1; i <= repeatation; i++) {
        string = string + this;
    }
    return string;
}
"prem".repeatify(3)