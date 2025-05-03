
import { Route, Routes } from 'react-router-dom';
import './App.css';
import Authentication from './pages/Authentication/Authentication';
import Message from './pages/Message/Message';
import { HomePage } from './pages/HomePage/HomePage';

function App() {
  return (
    <div className="">

      <Routes>
        <Route path='/' element={<Authentication />} />
        <Route path='/home' element={<HomePage/>} />
        <Route path='/message' element={<Message/>} />
      </Routes>



    </div>
  );
}

export default App;
