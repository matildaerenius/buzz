import React from "react";
import { navigationMenu } from "./SidebarNavigation";

const Sidebar = () => {
  return (
    <div className="card h-screen flex-col justify-between py-5">
      <div className="space-y-8 pl-5">
        <div className="">
          <span className="logo font-bold text-xl">Buzz</span>
        </div>
        <div className="space-y-8">
          {navigationMenu.map((item) => (
            <div className=" cursor-pointerflex space-x-3 items-center">
              {item.icon}
              <p className="text-xl">{item.title}</p>
            </div>
          ))}
        </div>
      </div>
    </div>
  );
};

export default Sidebar;
