import * as fs from "fs";

enum ROLE {
  endUser,
  author,
  subAdmin,
  admin,
}

fs.readFile("input.txt", "utf8", (err, data) => {
    if (err) {
        throw err;
    }
    const roles: string[] = data.split(",");

    const role1: ROLE = ROLE[roles[0]];
    const role2: ROLE = ROLE[roles[1]];

    if (role1 > role2) {
      console.log(`${ROLE[role1]} has more priority than ${ROLE[role2]}`);
    } else if (role1 < role2) {
      console.log(`${ROLE[role2]} has more priority than ${ROLE[role1]}`);
    } else {
      console.log(`Both roles have equal priority`);
    }
});



