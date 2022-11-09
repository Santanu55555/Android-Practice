import React from "react";
import { Routes, Route } from "react-router-dom";
import { Dashboard } from "./Dashboard";
export const AllRoutes = () => {
  return (
    <Routes>
      <Route path="/" element={<Dashboard />} />
    </Routes>
  );
};
