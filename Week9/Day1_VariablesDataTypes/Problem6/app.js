var ROLE;
(function (ROLE) {
    ROLE[ROLE["endUser"] = 0] = "endUser";
    ROLE[ROLE["author"] = 1] = "author";
    ROLE[ROLE["subAdmin"] = 2] = "subAdmin";
    ROLE[ROLE["admin"] = 3] = "admin";
})(ROLE || (ROLE = {}));
var input = "endUser,admin";
var roles = input.split(",");
var role1 = ROLE[roles[0]];
var role2 = ROLE[roles[1]];
if (role1 > role2) {
    console.log("".concat(ROLE[role1], " has more priority than ").concat(ROLE[role2]));
}
else if (role1 < role2) {
    console.log("".concat(ROLE[role2], " has more priority than ").concat(ROLE[role1]));
}
else {
    console.log("Both roles have equal priority");
}
